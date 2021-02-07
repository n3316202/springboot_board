package edu.bit.ex.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.board.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	public int boardCount();
}
