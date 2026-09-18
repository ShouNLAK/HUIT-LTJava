package com.example.tuan_05.DAO;

import com.example.tuan_05.Model.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SinhVienDAOImpl implements SinhVienDAO {
    private EntityManager entityManager;

    @Autowired
    public SinhVienDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(SinhVien sv) {
        entityManager.persist(sv);
    }

    @Override
    public SinhVien findById(int id)
    {
        return entityManager.find(SinhVien.class, id);
    }

    @Override
    public List<SinhVien> findAll()
    {
        TypedQuery<SinhVien> theQuery = entityManager.createQuery("FROM SinhVien", SinhVien.class);
        return theQuery.getResultList();
    }

    @Override
    public List<SinhVien> search(String keyword) {
        String jpql = "FROM SinhVien WHERE firstName LIKE :kw OR lastName LIKE :kw OR email LIKE :kw";
        TypedQuery<SinhVien> theQuery = entityManager.createQuery(jpql, SinhVien.class);
        theQuery.setParameter("kw", "%" + keyword + "%");
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(SinhVien sv) {
        entityManager.merge(sv);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        SinhVien sv = entityManager.find(SinhVien.class, id);
        if (sv != null)
        {
            entityManager.remove(sv);
        }
    }
}
