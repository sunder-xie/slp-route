package com.ai.slp.route.service.business.interfaces;

import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupAddResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupPageSearchResponse;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateRequest;
import com.ai.slp.route.api.routegroupmanage.param.RouteGroupStateResponse;

public interface IRouteGroupBusiSV {
	public RouteGroupPageSearchResponse queryPageSearch(RouteGroupPageSearchRequest request);
	public RouteGroupAddResponse insertRouteGroup(RouteGroupAddRequest request);
	public RouteGroupStateResponse findRouteGroupState(RouteGroupStateRequest request);
}
