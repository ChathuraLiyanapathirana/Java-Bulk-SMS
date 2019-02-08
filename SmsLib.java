/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfcsmsclient;

import java.util.List;
import org.smslib.AGateway;
import org.smslib.IInboundMessageNotification;
import org.smslib.IOutboundMessageNotification;
import org.smslib.InboundMessage;
import org.smslib.Message;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;

/**
 *
 * @author SUMIRAX
 */
public class SmsLib {

    public void sendMessage(List<OutboundMessage> msgList, String port) throws Exception {

        SerialModemGateway gateway = new SerialModemGateway("", port, 9600, "", "");
        gateway.setInbound(true);
        gateway.setOutbound(true);

        OutboundNotification outboundNotification = new OutboundNotification();
        InboundNotification inboundNotification = new InboundNotification();

        Service service = Service.getInstance();
        service.setOutboundMessageNotification(outboundNotification);
        service.setInboundMessageNotification(inboundNotification);
        service.addGateway(gateway);
        service.startService();
        for (OutboundMessage msgList1 : msgList) {
            service.sendMessage(msgList1);
            System.out.println(msgList1.getMessageStatus());
            System.out.println(msgList1.getRecipient());
        }
//        int sendMessages = service.sendMessages(msgList);
        service.stopService();
    }

    public class InboundNotification implements IInboundMessageNotification {

        @Override
//Get triggered when a SMS is received
        public void process(AGateway gateway, Message.MessageTypes messageTypes, InboundMessage inboundMessage) {

            System.out.println(inboundMessage);
            try {
//                gateway.deleteMessage(inboundMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class OutboundNotification implements IOutboundMessageNotification {

//Get triggered when a SMS is sent
        @Override
        public void process(AGateway gateway, OutboundMessage outboundMessage) {
            System.out.println(outboundMessage);
        }
    }

}
