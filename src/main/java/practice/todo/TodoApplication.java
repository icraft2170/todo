package practice.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}


/**
 * 	레이어드 아키텍쳐
 * 		- 프로젝트에서 어떻게 코드를 적절히 분리하고 관리할 것이냐.
 *
 *
 * 	Request/Response <=> 프레젠테이션 레이어(Controller) -> 비즈니스 레이어 (Service)
 * 														-> 퍼시스턴스 레이어 (Persistence) -> 데이터베이스 레이어(DB)
 *
 * 		Request  /  Response
 *   --------------------------
 *   프레젠테이션 레이어 (Controller)
 *   --------------------------
 *   비즈니스 레이어 (Service)
 *   --------------------------
 *   퍼시스턴스 레이어(Persistence)
 *   --------------------------
 *   데이터베이스 레이어(DataBase)
 *   --------------------------
 *
 *
 *
 * 	REST 아키텍쳐 스타일
 * 		- 어떤 형식으로 요청하고 응답 받는지에 대한 것.
 * 		- REST 아키텍처 스타일을 따라 설계 및 구현된 서비스를 RESTful 서비스라고 한다.
 *
 * 	Representational State Transfer (REST) : 아키텍쳐 스타일
 * 	> 아키텍쳐 스타일과 아키텍쳐 패턴
 * 	> - 아키텍쳐 패턴
 * 	>		- 반복되는 문제 상황을 해결하는 도구
 * 	> - 아키텍쳐 스타일
 *  >		- 반복되는  아키텍쳐 디자인
 *
 *  RESTful API 가이드라인
 *
 *  REST 제약조건
 *  	1. 클라이언트-서버(Client-Server)
 *  		- 리소스 관리 서버가 존재하고, 다수의 클라이언트가 리소스를 소비하기 위해 서버에 접근하는 구조.
 *  	2. 상태가 없는 (Stateless)
 *  		- 요청시에 이전 요청의 영향을 받지 않는다. ( login 할 때 쿠키로 로그인 데이터를 계속 보내줘야하는 이유도 이와 같다. 서버에 저장 x)
 *  	3. 캐시되는 (Cacheable) 데이터
 *  		- 서버에서 리소스를 리턴할 때 캐시가 가능한지 아닌지 명시할 수 있어야 한다. HTTP에서는 'cache-control' 이라는 헤더에 명시
 *  	4. 일관적인 인터페이스 (Uniform Interface)
 *  		- 리소스 접근 시 인터페이스가 일관적이어야 한다. ( 요청 응답의 형태 or uri 등 )
 *  		- 서버가 리턴할 때는 리소스를 수정할 충분한 정보가 필요하다.
 *  	5. 레이어 시스템 (Layered System)
 *  		- 여러 개의 레이어로 된 서버를 거칠 수 있다. (ex. 인증 서버, 캐싱 서버, 로드 밸런서...등) 이 사이에 레이어들은
 *  		요청에 어떤 영향을 미치지 않으면 클라이언트는 서버의 레이어 존재 유무를 알지 못한다.
 *  	6. 코드-온-디맨드(Code-On-Demand)[선택사항]
 *  		- 	클라이언트는 서버에 코드 요청이 가능하고, 서버가 리턴한 코드를 실행할 수 있다.
 *
 *
 */