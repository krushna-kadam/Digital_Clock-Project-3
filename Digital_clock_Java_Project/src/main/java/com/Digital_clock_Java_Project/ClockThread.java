package com.Digital_clock_Java_Project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread extends Thread {

	DigitalClock dc;

	public ClockThread(DigitalClock dc) {
		this.dc = dc;
		start();
	}

	@Override
	public void run() {
		while (true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
			String formatDate = sdf.format(date);

			String[] dateArray = formatDate.split(":");
			dc.textField.setText(dateArray[0]);
			dc.textField_1.setText(dateArray[1]);
			dc.textField_2.setText(dateArray[2]);

		}

	}
}
