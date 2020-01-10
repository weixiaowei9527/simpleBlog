package wwj.service;

import wwj.bean.Blog;

import java.util.List;

public interface LoadBlogService {
    List<Blog> loadBlog(String start);

    List<Blog> loadBlog(int i, int i1);

    int getTotalRows();
}
