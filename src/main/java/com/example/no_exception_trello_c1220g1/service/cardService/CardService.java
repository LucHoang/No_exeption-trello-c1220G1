package com.example.no_exception_trello_c1220g1.service.cardService;

import com.example.no_exception_trello_c1220g1.model.Entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardService implements ICardService {
    @Override
    public List<Card> findAll() {
        return null;
    }

    @Override
    public Optional<Card> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Card save(Card card) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
//    @Autowired
//    private CardRepo cardRepo;
//
//    @Override
//    public List<Card> findAll() {
//        return null;
//    }
//
//    @Override
//    public Card findById(Long id) {
//        return cardRepo.findById(id).get();
//    }
//
//    @Override
//    public Card save(Card card) {
//        return cardRepo.save(card);
//    }
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void delete(Long id) {
//        cardRepo.deleteById(id);
//    }
//
//    @Override
//    public List<Card> findCardsByListId(Long id) {
//        return cardRepo.findCardsByList_IdOrderByPosition(id);
//    }
//
//    @Override
//
//    public List<Card> findCardsByBroadIdAndUserId(Long broadId, Long userId) {
//        return cardRepo.findCardByUserIdAndBroadId(broadId, userId);
//    }
//
//    @Override
//    public List<Card> findAllCard() {
//        return cardRepo.findAllCard();
//    }
//
//    @Override
//    public List<Card> findCardByLabel(Long label_id, Long board_id) {
//        return cardRepo.findCardsByLabel(label_id, board_id);
//    }
}
