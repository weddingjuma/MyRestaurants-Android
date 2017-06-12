package com.epicodus.myrestaurants.util;

/**
 * Created by evanbishop on 6/12/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
