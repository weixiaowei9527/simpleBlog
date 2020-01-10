package wwj.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import wwj.bean.Blog;

import java.util.List;

public interface BlogDao {
    @Select("select * from wenzhang limit #{kaishi},#{geshu}")
    List<Blog> selectLimit(@Param("kaishi")int kaishi, @Param("geshu")int geshu);
    @Insert("insert into wenzhang(wtitle,wcontent,wtime)values(#{wtitle},#{wcontent},#{wtime})")
    int putBlog(Blog blog);
    @Select("select count(*) from wenzhang")
    int getTotalRows();
}
