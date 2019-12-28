package com.zking.eurekaprovider.server;

import com.zking.vo.model.GjcWithBLOBs;
import com.zking.vo.uitl.PageBean;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@CacheConfig(cacheNames = {"GjcWithBLOBscachs"})
public interface GjcServer {
//@Cacheable(value = "GjcWithBLOBschs",key = "'Gid-'+#GjcWithBLOBs.getGid()",unless = "#result.size()==0")
List<GjcWithBLOBs>  list(GjcWithBLOBs GjcWithBLOBs, PageBean pageBean);


int   upGjc(GjcWithBLOBs gjcWithBLOBs);


int intGjc(GjcWithBLOBs gjcWithBLOBs);


List<GjcWithBLOBs> GjcWithBLOBsActionList(GjcWithBLOBs GjcWithBLOBs, PageBean pageBean);



}
