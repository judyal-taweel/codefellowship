//package com.codefellowship.codefellowship.Users;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import java.util.List;
//import java.util.Optional;
//
//public class UserServiceImp implements UserRepository{
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public Users findUsersByUsername(String username) {
//        return userRepository.findUsersByUsername(username);
//    }
//
//    @Override
//    public Users findAllByUsername(String username) {
//        return userRepository.findAllByUsername(username);
//    }
//
//    @Override
//    public List<Users> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<Users> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Users> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public List<Users> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Users entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Users> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public <S extends Users> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Users> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Users> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Users> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Users getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Users getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Users> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Users> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Users> boolean exists(Example<S> example) {
//        return false;
//    }
//}
