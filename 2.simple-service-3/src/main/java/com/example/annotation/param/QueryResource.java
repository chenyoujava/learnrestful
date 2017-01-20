package com.example.annotation.param;

import com.example.annotation.param.bean.ParamCache;
import com.example.domain.Link;
import com.example.domain.Yijing;
import com.example.domain.Yijings;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Path("query-resource")
public class QueryResource {
	private static final Logger LOGGER = Logger.getLogger(QueryResource.class);
	@Context
	UriInfo uriInfo;

	@Path("yijings")
	@GET
	@Produces(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
	public Yijings getByPaging(@QueryParam("start") final int start, @QueryParam("size") final int size) {
		final Yijings result = new YiJings();
		final List<Link> links = new ArrayList<>();
		final UriBuilder ub = uriInfo.getAbsolutePathBuilder().replacePath("query-resource/yijing");
		ArrayList<Yijing> globaList = ParamCache.LIST:
		int listSize = globalList.size();
		final int max = size > listSize ? listSize : size;
		for (int i = 0; i < max; i++) {
			final Yijing yijing = globalList.get(start + i);
			final URI location = ub.clone().queryParam("id", yijing.getSequence()).build();
			final Link link = new Link("detail", location.toASCIIString(), MediaType.APPLICATION_XML);
			links.add(link);
			yijings.add(yijing);
		}
		result.setLinks(links);
		result.setGuas(yijings);
		QueryResource.LOGGER.debug(result);
		return result;
	}
}
