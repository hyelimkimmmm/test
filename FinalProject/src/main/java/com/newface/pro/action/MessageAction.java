package com.newface.pro.action;

/* import javax.xml.ws.Response; */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newface.pro.model.MessageUser;

@Controller
public class MessageAction {

  @Autowired
  private MessageUser messageUser;

  // @RequestMapping(value = "/")
  // public String home() {
  // return "home";
  // }

  /*
   * @MessageMapping(value = "/") public Response response(MessageUser messageUser) { return new
   * Response(messageUser.getMessageUser() + "님이 채팅방에 입장했습니다."); }
   */

}
