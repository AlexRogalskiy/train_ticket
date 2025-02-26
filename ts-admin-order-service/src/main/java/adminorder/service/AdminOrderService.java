package adminorder.service;

import adminorder.domain.request.AddOrderRequest;
import adminorder.domain.request.DeleteOrderRequest;
import adminorder.domain.request.UpdateOrderRequest;
import adminorder.domain.response.AddOrderResult;
import adminorder.domain.response.DeleteOrderResult;
import adminorder.domain.response.GetAllOrderResult;
import adminorder.domain.response.UpdateOrderResult;

public interface AdminOrderService {
    GetAllOrderResult getAllOrders(String id);
    DeleteOrderResult deleteOrder(DeleteOrderRequest request);
    UpdateOrderResult updateOrder(UpdateOrderRequest request);
    AddOrderResult addOrder(AddOrderRequest request);
}
