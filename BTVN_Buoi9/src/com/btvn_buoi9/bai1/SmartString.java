package com.btvn_buoi9.bai1;

import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;

public class SmartString {
    private String text;
    private String StartTitle = "<title><![CDATA[";
    private String EndTitle = "]]></title>";
    private String StartLinkDetail = "<link><![CDATA[";
    private String EndLinkDetail = "]]></link>";
    private String StartLinkImg = "<img src=\"";
    private String EndLinkImg = "\" /></a>]]>";
    private String StartDate = "<pubDate><![CDATA[";
    private String EndDate = "]]></pubDate>";

    ArrayList<News> listNews = new ArrayList<>();


    public SmartString(String text) {
        this.text = text;
    }
    public void filter() {
        int count = 0;
        int indexStartTitle = text.indexOf(StartTitle);
        int indexEndTitle = text.indexOf(EndTitle);
        int indexStartLinkDetail = text.indexOf(StartLinkDetail);
        int indexEndLinkDetail = text.indexOf(EndLinkDetail);
        int indexStartLinkImg = text.indexOf(StartLinkImg);
        int indexEndLinkImg = text.indexOf(EndLinkImg);
        int indexStartDate = text.indexOf(StartDate);
        int indexEndDate = text.indexOf(EndDate);
        String title1 = "";
        String LinkDetail = "";
        String LinkImg = "";
        String date = "";

        while (indexStartTitle != -1) {
            title1 = text.substring(indexStartTitle + StartTitle.length(), indexEndTitle);
            LinkDetail = text.substring(indexStartLinkDetail + StartLinkDetail.length(), indexEndLinkDetail);
            LinkImg = text.substring(indexStartLinkImg + StartLinkImg.length(), indexEndLinkImg);
            date = text.substring(indexStartDate + StartDate.length(), indexEndDate);

            News new1 = new News(title1, LinkDetail, LinkImg, date);
            listNews.add(count, new1);

            indexStartTitle = text.indexOf(StartTitle, indexStartTitle + 1);
            indexEndTitle = text.indexOf(EndTitle, indexEndTitle + 1);
            indexStartLinkDetail = text.indexOf(StartLinkDetail, indexStartLinkDetail + 1);
            indexEndLinkDetail = text.indexOf(EndLinkDetail, indexEndLinkDetail + 1);
            indexStartLinkImg = text.indexOf(StartLinkImg, indexStartLinkImg + 1);
            indexEndLinkImg = text.indexOf(EndLinkImg, indexEndLinkImg + 1);
            indexStartDate = text.indexOf(StartDate, indexStartDate + 1);
            indexEndDate = text.indexOf(EndDate, indexEndDate + 1);
            count += 1;
        }
    }
    public void print () {
        for (News news : listNews) {
            news.inThongTin();
            System.out.println("========================");
        }
    }

}
