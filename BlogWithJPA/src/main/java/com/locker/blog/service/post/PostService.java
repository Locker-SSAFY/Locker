package com.locker.blog.service.post;

import com.locker.blog.domain.post.PagingPost;
import com.locker.blog.domain.post.Post;

import java.util.List;
import java.util.Map;

public interface PostService {
    public int insert(Post p);
    public int delete(String post_id);
    public Post selectOne(String post_id);
    public int update(Post post);
    public List<PagingPost> selectAll(Map<String,Long> pageMap);
    public List<Post> selectAllByWriter(String email);
    public int addLike(Long pid);

}
