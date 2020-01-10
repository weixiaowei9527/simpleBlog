package wwj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wwj.bean.Blog;
import wwj.dao.BlogDao;

@Service
public class PutBlogServiceImpl implements PutBlogService{
    @Autowired
    private BlogDao blogDao;


    @Override
    public int putBlog(Blog blog) {
        int rs = blogDao.putBlog(blog);
        return rs;
    }
}
