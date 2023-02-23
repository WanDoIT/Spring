package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //마이바티스에서 매퍼를 지칭 -(스프링에서는 생략가능)
public interface TestMapper {
	public String getTime(); //1
	public ArrayList<ScoreVO> getScore();
	public ScoreVO getOne(int a);
	
	public int insertOne(String name);
	public int insertTwo(ScoreVO vo);
//	public int insertTwo(String name,String kor,String eng);
	public int insertThree(Map<String,String> map);
	
	public Map<String,Object> selectMap(int num); //3번 키값 조회
	public ArrayList<Map<String,Object>> selectTwo();//맵을 통한 다중행 조회
	
	public boolean updateOne(ScoreVO vo); //update (15번)
	
	public void insertFour(@Param("aa") String name, @Param("bb") int kor);
}
