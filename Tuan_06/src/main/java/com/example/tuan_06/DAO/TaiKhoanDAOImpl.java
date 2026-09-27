package com.example.tuan_06.DAO;

import com.example.tuan_06.Model.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaiKhoanDAOImpl implements TaiKhoanDAO {
    private final EntityManager entityManager;

    @Autowired
    public TaiKhoanDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(TaiKhoan tk) {
        entityManager.persist(tk);
    }

    @Override
    @Transactional
    public void update(TaiKhoan tk) {
        entityManager.merge(tk);
    }

    @Override
    @Transactional
    public void delete(TaiKhoan tk) {
        entityManager.remove(tk);
    }

    @Override
    public List<TaiKhoan> findAll() {
        TypedQuery<TaiKhoan> theQuery =
                entityManager.createQuery("from TaiKhoan", TaiKhoan.class);
        return theQuery.getResultList();
    }

    @Override
    public TaiKhoan findById(int id) {
        return entityManager.find(TaiKhoan.class, id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TaiKhoan tk = entityManager.find(TaiKhoan.class, id);
        if (tk != null) {
            entityManager.remove(tk);
        }
    }

    @Override
    public List<TaiKhoan> search(String keyword) {
        String jpql = "FROM TaiKhoan WHERE FirstName LIKE :kw OR LastName LIKE :kw OR Email LIKE :kw";
        TypedQuery<TaiKhoan> theQuery = entityManager.createQuery(jpql, TaiKhoan.class);
        theQuery.setParameter("kw", "%" + keyword + "%");
        return theQuery.getResultList();
    }
}
