package mapper;

import java.util.List;

import com.dao.Manage;

public interface ManageMapper {
	public Manage findManageByNo(Integer no);
	
	public List<Manage> findManageAll();
	
	public int insertManage(Manage manage);
	
	public int updateManage(Manage manage);
	
	public int deleteManage(Integer no);
	
	
	
}
