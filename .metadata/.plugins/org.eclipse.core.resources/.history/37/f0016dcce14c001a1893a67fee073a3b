package com.ioc.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Hey!!!!! the event is published...!!!" + event + " " + event.getClass());
	}

}
