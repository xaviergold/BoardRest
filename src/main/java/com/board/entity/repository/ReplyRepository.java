package com.board.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.board.dto.ReplyInterface;
import com.board.entity.ReplyEntity;

public interface ReplyRepository extends JpaRepository<ReplyEntity,Long>{
	@Query(value="select replyseqno,replywriter,replycontent,replyregdate,seqno,email from tbl_reply where seqno=:seqno order by replyseqno desc",nativeQuery=true)
	List<ReplyInterface> replyView(@Param("seqno") Long seqno);
}
