package com.board.service;

import java.util.List;
import org.springframework.data.domain.Page;

import com.board.dto.BoardDTO;
import com.board.dto.FileDTO;
import com.board.dto.ReplyDTO;
import com.board.dto.ReplyInterface;
import com.board.entity.BoardEntity;
import com.board.entity.FileEntity;
import com.board.entity.LikeEntity;

public interface BoardService {

	//게시물 목록 보기
	public Page<BoardEntity> list(int startPoint,int postNum, String keyword);
	
	//게시물 번호 구하기
	public Long getSeqnoWithNextval();	
	
	//게시물 등록
	public void write(BoardDTO board);
	
	//파일 업로드 정보 등록
	public void fileInfoRegistry(FileDTO fileDTO) throws Exception;

	//게시글 내에서 업로드된 파일 목록 보기
	public List<FileEntity> fileListView(Long seqno) throws Exception;

	//게시물 수정에서 파일 삭제
	public void deleteFileList(Long fileseqno,String kind) throws Exception;

	//다운로드를 위한 파일 정보 보기
	public FileDTO fileInfo(Long fileseqno) throws Exception;
	
	//게시물 상세 보기
	public BoardDTO view(Long seqno);
	
	//이전 보기 
	public Long pre_seqno(Long seqno, String keyword);
	
	//다음 보기
	public Long next_seqno(Long seqno, String keyword);
	
	//조회수 업데이트
	public void hitno(BoardDTO board);
	
	//게시물 수정 
	public void modify(BoardDTO board);
	
	//게시물 삭제
	public void delete(Long seqno);
	
	//좋아요/싫어요 확인 가져 오기
	public LikeEntity likeCheckView(Long seqno,String userid) throws Exception;
	
	//좋아요/싫어요 갯수 수정하기
	public void boardLikeUpdate(Long seqno, int likecnt, int dislikecnt) throws Exception;
	
	//좋아요/싫어요 확인 등록하기
	public void likeCheckRegistry(Long seqno,String email,String mylikeCheck,String mydislikeCheck,String likeDate,String dislikeDate) throws Exception;
	
	//좋아요/싫어요 확인 수정하기
	public void likeCheckUpdate(Long seqno,String email,String mylikeCheck,String mydislikeCheck,String likeDate,String dislikeDate) throws Exception;
	
	//댓글 보기
	public List<ReplyInterface> replyView(ReplyInterface reply) throws Exception;
	
	//댓글 수정
	public void replyUpdate(ReplyInterface reply) throws Exception;
	
	//댓글 등록 
	public void replyRegistry(ReplyInterface reply) throws Exception;
	
	//댓글 삭제
	public void replyDelete(ReplyInterface reply) throws Exception;
	
	
}
