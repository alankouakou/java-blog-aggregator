<%@ include file="../layout/tags.jsp" %>
<br />
<p class="alert alert-success">Mon tableau de bord</p>
<p class="lead">La gestion sans stress </p>
<security:authorize access="hasRole('ROLE_ADMIN')">
<a class="btn btn-primary" href="<spring:url value="/consommations.html"/>">Produits</a>
<a class="btn btn-primary" href="<spring:url value="/commandes.html"/>">Ventes</a>
<a class="btn btn-primary" href="<spring:url value="/graphiques.html"/>">Graphes</a>
</security:authorize>
<p></p>  

