package org.tukorea.free.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.tukorea.free.domain.PostVO;
import org.tukorea.free.persistence.PostDAO;

import java.util.List;

@Qualifier("algoService")
@Service
public class AlgorithmPostServiceImpl implements PostService {
    @Autowired
    @Qualifier("algo")
    PostDAO postDAO;

    @Override
    public PostVO readPost(Integer id) throws Exception {
        PostVO vo = postDAO.read(id);
        return vo;
    }

    @Override
    public List<PostVO> readPostList() throws Exception {
        List<PostVO> voList = postDAO.readList();
        return voList;
    }

    @Override
    public void addPost(PostVO post) throws Exception {
        postDAO.add(post);
    }

    @Override
    public void deletePost(Integer id) throws Exception {
        postDAO.delete(id);
    }
}
