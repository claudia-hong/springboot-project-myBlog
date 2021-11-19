package com.cos.myblog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Reply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ Column(nullable = false, length=200)
	private String content;
	
	//어느 게시글의 답변인지? //여러개의 답변은 하나의 게시글에 존재
	@ManyToOne 
	@JoinColumn(name="boardId")
	private Board board;
	
	//누가 답변을 썼는가 //여러개의 답변은 한명의 유저만 쓸 수 있다.
	@ManyToOne 
	@JoinColumn(name="userId")
	private User user;
	
	@CreationTimestamp
	private Timestamp createDate;

}
