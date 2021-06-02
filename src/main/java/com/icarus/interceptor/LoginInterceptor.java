package com.icarus.interceptor;

import com.icarus.model.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器，强制用户必须登录才可以访问
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 获取请求的 URL
        String url = request.getRequestURI();
        // 放行登录页面
        if (url.contains("/login")) {
            return true;
        }
        // 获取 Session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        // 判断 Session 中是否有用户数据，如果有返回 true，继续执行
        if (user != null) {
            return true;
        }

        // 设置不符合条件的提示信息
        request.setAttribute("msg", "您还没有登录，请先登录！");
        // 转发到登录页面
        request.getRequestDispatcher("login").forward(request, response);

        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
