package com.chenhl.springbootdemo.listener;

import com.chenhl.springbootdemo.events.MyEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/24
 * @描述:
 */
@Component
public class MyTransactionListener {


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onTestEvent(MyEvent myEvent) {
        System.out.println("myEvent detected ……");
        Object source = myEvent.getSource();
        System.out.println(source);
    }
}
