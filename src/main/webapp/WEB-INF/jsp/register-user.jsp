<br />
<%@ include file="../layout/tags.jsp"%>

<form:form modelAttribute="user" cssClass="form-horizontal">
	<div class="form-group">
		<label for="login" class="col-sm-2 control-label">Login:</label>
		<div class="col-sm-4">
			<form:input path="name" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Password:</label>
		<div class="col-sm-4">
			<form:password path="password" cssClass="form-control" />
		</div>
	</div>

	<div class="form-group form-actions">
	<div class="col-sm-5"></div>
		<div class="col-sm-2">
			<input type="submit" value="Save" class="btn btn-lg btn-success" />
		</div>
	</div>
</form:form>
