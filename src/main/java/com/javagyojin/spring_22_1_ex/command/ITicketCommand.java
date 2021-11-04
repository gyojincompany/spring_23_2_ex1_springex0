package com.javagyojin.spring_22_1_ex.command;

import com.javagyojin.spring_22_1_ex.dto.TicketDto;

public interface ITicketCommand {
	public void execute(TicketDto ticketDto);
}
