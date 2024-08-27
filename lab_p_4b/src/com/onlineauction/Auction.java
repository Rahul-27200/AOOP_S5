package com.onlineauction;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private List<Bidder> bidders = new ArrayList<>();
    private String item;

    public void setItem(String item) {
        this.item = item;
        notifyBidders(AuctionEvent.ITEM_AVAILABLE);
    }

    public void startBidding() {
        System.out.println("Bidding started for item: " + item);
        notifyBidders(AuctionEvent.BIDDING_STARTED);
    }

    public void endBidding() {
        System.out.println("Bidding ended for item: " + item);
        notifyBidders(AuctionEvent.BIDDING_ENDED);
    }

    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
    }

    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
    }

    private void notifyBidders(AuctionEvent event) {
        for (Bidder bidder : bidders) {
            bidder.update(event, item);
        }
    }
}
