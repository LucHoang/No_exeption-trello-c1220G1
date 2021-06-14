package com.example.no_exception_trello_c1220g1.repository;

import com.example.no_exception_trello_c1220g1.model.Entity.GroupTagUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGroupTagUserRepository extends JpaRepository<GroupTagUser,Long> {
    GroupTagUser findByGroupTrello_IdAndAndUser_Id (Long groupId, Long userId);
}
