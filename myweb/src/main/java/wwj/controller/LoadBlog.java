package wwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import wwj.bean.Blog;
import wwj.service.LoadBlogService;
import wwj.service.PutBlogService;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class LoadBlog {
    @Autowired
    private LoadBlogService loadBlogService;
    @RequestMapping(value = {"/loadBlog"})
   ModelAndView putBlog(HttpSession session, String start){
        System.out.println(start);
        if (start == null) {
            start = "0";
        }

            List<Blog> blogs = loadBlogService.loadBlog(Integer.parseInt(start)*5,5);
            int rows = loadBlogService.getTotalRows();

        if (rows!=0) {
            rows = rows/5;
        }
        System.out.println("kdjslf");
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("total",rows);
        modelAndView.addObject("wenzhangList",blogs);
        modelAndView.setViewName("loadBlog.jsp");//请求转发（forward）
        return modelAndView;
    }
}
