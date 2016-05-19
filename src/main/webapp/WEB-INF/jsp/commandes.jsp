<%@ include file="../layout/tags.jsp" %>

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#myModal">Ajouter commande</button>

<!-- Modal -->
<form:form modelAttribute="commande" cssClass="form-horizontal">
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Nouvelle commande</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="nom" class="col-sm-2 control-label">Client:</label>
						<div class="col-sm-4">
							<form:select items="${clients}" itemLabel="nom" itemValue="id" path="client" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="date" class="col-sm-2 control-label">Date commande :</label>
						<div class="col-sm-4">
							<form:input path="dateCommande" cssClass="form-control" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
					<input type="submit" class="btn btn-primary" value="Creer commande" />
				</div>
			</div>
		</div>
	</div>
</form:form>
<table class="table table-condensed table-striped table-hover">
	<thead>
		<tr>
			<th>N&deg; commande</th>
			<th>Date</th>
			<th>Client</th>
			<th>Total</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${commandes}" var="commande">
			<tr>
				<td><a href="<spring:url value="/commande/${commande.id}.html"></spring:url>">Commande ${commande.id}</a></td>
				<td><fmt:formatDate type="date" dateStyle="Long" value="${commande.dateCommande}" /></td>
				<td>${commande.client.nom}</td>
				<td><fmt:formatNumber value="${commande.totalCommande}" type="currency" maxFractionDigits="0" currencySymbol="FCFA"/></td>
			</tr>
		</c:forEach>
		<security:authorize access="hasRole('ROLE_ADMIN')">
		<tr>
		<td><p class="lead">Recette :</p></td>
		<td></td>
		<td></td>
		<td><p class="lead"><fmt:formatNumber value="${totalCommandes}" type="currency" maxFractionDigits="0" currencySymbol="F CFA" /></p></td>
		</tr>
		</security:authorize>
	</tbody>
</table>