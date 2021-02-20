package com.chanmei.dao;

import com.chanmei.entity.Ticket;

public interface TiecketDao {
	//根据id查找
	Ticket findTicketById(Integer ticketid);
	
	//新增
	void addTicket(Ticket ticket);
	
	//修改
	void updateTicket(Ticket ticket);
	
	//删除
	void deleteTicket(Ticket ticket);
}
