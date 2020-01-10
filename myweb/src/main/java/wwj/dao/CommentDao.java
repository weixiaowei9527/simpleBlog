package wwj.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import wwj.bean.Comment;

import java.util.List;

public interface CommentDao {

    @Select("select * from comment where id = #{id}")
    List<Comment> getCommentsById(@Param("id") Integer id);
    @Insert("insert into comment (id,author_name,date,content,author_url) values (id,author_name,date,content,author_url)")
    Integer addCommentsById(Comment comment);
}
