package wwj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wwj.bean.Blog;
import wwj.dao.BlogDao;

import java.util.List;
@Service
public class LoadBlogServiceImpl implements LoadBlogService{
    @Autowired
    private BlogDao blogDao;
    @Override
    public List<Blog> loadBlog(String start) {
        return null;
    }

    @Override
    public List<Blog> loadBlog(int start, int rows) {
        List<Blog> blogs = blogDao.selectLimit(start, rows);
        return blogs;
    }

    @Override
    public int getTotalRows() {
        int totalRows = blogDao.getTotalRows();
        System.out.println("totalRows:"+totalRows);
        return totalRows;
    }
}
