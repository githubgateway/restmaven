<html>
<body>
<h1>Login Here</h1>
<p th:text="${loginresp}">Sucess</p>
<form class="form-signin" method="post" action="#" th:action="@{/login}" id="loginFormPage">
                <div th:if="${param.error}" class="form-group has-error" >    
                    <span>Authentication Failed: Bad credentials</span>
                </div>
                <div th:if="${param.logout}" class="form-group has-success"> 
                    <span>You have been logged out.</span>
                </div>
                <input type="text" id="username" name="username" class="form-control" placeholder="Username" required="true" autofocus="true"/>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password" required="true"/>
            	<!-- <input type="text" id="tenantCode" name="tenantCode" class="form-control" placeholder="Account ID" required="true" autofocus="true"/> -->
            	
                <!-- <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"/> Remember me
                    </label>
                </div> -->
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
                <a href="forgot" class="forgot-password">Forgot the password?</a>                
            </form>
<input type="text">
</body>
</html>