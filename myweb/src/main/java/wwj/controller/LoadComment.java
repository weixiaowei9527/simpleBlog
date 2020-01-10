package wwj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wwj.bean.Comment;
import wwj.dao.CommentDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comment")
public class LoadComment {

    ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private CommentDao commentDao;
    @RequestMapping(value = "/select",produces = "application/json;charset=utf-8")
    @ResponseBody
    String getComment(Integer id){

        List<Comment> comments = commentDao.getCommentsById(id);
        String value = null;
        try {
            value = mapper.writeValueAsString(comments);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(value);
        return value;
    }
    @RequestMapping(value = "/add",produces = "application/json;charset=utf-8")
    @ResponseBody
    String addCommentById(Integer id, Comment comment){
        System.out.println(id);
        System.out.println(comment);
        Integer rs = 0;
        if(comment!=null){
            rs = commentDao.addCommentsById(comment);
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("result",rs);
        String value = null;
        try {
            value = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return value;
    }
}
