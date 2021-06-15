package com.example.no_exception_trello_c1220g1.repository;

import com.example.no_exception_trello_c1220g1.model.Entity.BoardTagAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBoardTagAppUserRepository extends JpaRepository<BoardTagAppUser,Long> {
    @Query(value = "SELECT * FROM board join board_tag_app_user on board.id = board_tag_app_user.board_id where board_tag_app_user.app_user_id = ?1 ",nativeQuery = true)
    List<BoardTagAppUser> findBoardTagAppUserByUserIdAndTypeBoardAndRoleUser(Long id);
}
