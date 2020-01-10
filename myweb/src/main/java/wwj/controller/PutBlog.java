package wwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;
import wwj.bean.Blog;
import wwj.service.PutBlogService;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class PutBlog {
    @Autowired
    private PutBlogService putBlogService;
    @RequestMapping(value = {"/putBlog"}, method = RequestMethod.POST)
    ModelAndView putBlog(HttpSession session, Blog blog){
        System.out.println(blog);
        blog.setWtime(new Date());
        int rs = putBlogService.putBlog(blog);
        System.out.println("发表博文");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",rs);
        modelAndView.setViewName("resultMessage.jsp");//请求转发（forward）

        return modelAndView;
    }
}
