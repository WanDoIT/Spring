package com.lsw.myweb.trip.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.lsw.myweb.command.TripVO;
import com.lsw.myweb.util.Criteria;

@Mapper
public interface TripMapper {
	public int noticeRegist(TripVO vo);
//	public ArrayList<TripVO> getList(); //조회
	public ArrayList<TripVO> getList(Criteria cri); 
	public int getTotal(Criteria cri);	//전체게시글 수	
	
	public TripVO getContent(int tno);
	public int noticeModify(TripVO vo); //수정
	public int noticeDelete(int tno);
	
	public void upHit(int tno);//조회수
	
	public ArrayList<TripVO> getPrevNext(int tno);
}
