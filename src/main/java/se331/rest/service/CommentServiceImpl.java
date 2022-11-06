package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.CommentDao;
import se331.rest.dao.DocterDao;
import se331.rest.dao.PatientDao;
import se331.rest.entity.Comment;
import se331.rest.entity.Docter;
import se331.rest.entity.Patient;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentDao commentDao;

    @Autowired
    DocterDao docterDao;

    @Autowired
    PatientDao patientDao;

    @Override
    @Transactional
    public Comment save(Comment comment) {
        Docter doctor = docterDao.findById(comment.getComBy().getId()).orElse(null);
        Patient patient = patientDao.findById(comment.getComTo().getId()).orElse(null);
        comment.setComBy(doctor);
        comment.setComTo(patient);
        patient.getComments().add(comment);
        return commentDao.save(comment);
    }

    @Override
    public List<Comment> getAllComment() {
        return commentDao.getComment(Pageable.unpaged()).getContent();
    }
}
