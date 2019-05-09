package com.keyvalue.kvimplementation;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/item")
//@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class keyValueResourceClass {
	
	keyValueServiceClass kv=new keyValueServiceClass();

	@GET
	public List<keyValueModelClass> getMessages() {
		return kv.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	public keyValueModelClass getItem(@PathParam("messageId") long id) {
		return kv.getItem(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public keyValueModelClass addMessage(keyValueModelClass message) {
		return kv.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public keyValueModelClass updateMessage(@PathParam("messageId") long id, keyValueModelClass message) {
		message.setKey(id);
		return kv.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id) {
		kv.removeMessage(id);
	}
		
}
