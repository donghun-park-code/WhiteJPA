package site.metacoding.white.domain;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    private final EntityManager em;

    // id가 없으면 insrt 있으면 merge(덮어씌운다)
    public void save(Board board) {
        em.persist(board); // insert 됨
    }

    public Board findById(Long id) {
        // JPQL 문법
        Board boardPS = em.createQuery("select b from Board b where b.id = :id", Board.class)
                .setParameter("id", id)
                .getSingleResult();
        return boardPS;
    }

    public void delectById(Long id) {
        em.createQuery("delect form board b where b.id = : id")

                .setParameter("id", id)
                .executeUpdate();
    }

    public List<Board> findAll() {
        List<Board> boardList = em.createQuery("select b from board b", Board.class)
                .getResultList();
        return boardList;
    }
}