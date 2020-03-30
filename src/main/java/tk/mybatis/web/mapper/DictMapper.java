package tk.mybatis.web.mapper;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.web.model.SysDict;

import java.util.List;

public interface DictMapper {

    SysDict selectById(Long id);
    List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);
    int Insert(SysDict sysDict);
    int updateById(SysDict sysDict);
    int deleteById(Long id);

}
