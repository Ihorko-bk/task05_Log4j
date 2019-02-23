package com.ihorko.logClases;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    public static final String ACCOUNT_SID = "ACe247276b20820e08cdccae8632328cb6";
    public static final String AUTH_TOKEN = "625f96b3e81c6f90ea34015ffb6a3414";
    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber("+380630766807"), /*my phone number*/
            new PhoneNumber("+12056232436"), str) .create(); /*attached to me number*/
    }
}
