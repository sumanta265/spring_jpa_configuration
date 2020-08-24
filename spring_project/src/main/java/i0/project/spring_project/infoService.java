package i0.project.spring_project;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class infoService {

	@Autowired
	private infoRepository repo;
	
	public void save(Info info)
	{
		repo.save(info);
		
	}
	
	
	
	
}
