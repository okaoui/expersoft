<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="resources/dist/css/bootstrap-submenu.min.css">

  <script src="https://code.jquery.com/jquery-3.2.1.min.js" defer></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" defer></script>
  <script src="resources/dist/js/bootstrap-submenu.min.js" defer></script>
  <script type="text/javascript">
		$('[data-submenu]').submenupicker();
	</script>
</head>
<body>

<h3>Navbar</h3>
<nav class="navbar navbar-default">
  <div class="navbar-header">
    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-collapse">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>

    <a class="navbar-brand">Project Name</a>
  </div>

  <div class="collapse navbar-collapse">
    <ul class="nav navbar-nav">
      <li class="dropdown">
        <a tabindex="0" data-toggle="dropdown" data-submenu>
          Dropdown<span class="caret"></span>
        </a>

        <ul class="dropdown-menu">
  <li class="dropdown-submenu">
  <a tabindex="0">Action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another sub action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
    <li><a tabindex="0">Something else here</a></li>
    <li class="disabled"><a tabindex="-1">Disabled action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
  </ul>
</li>
<li class="dropdown-header">Dropdown header</li>
<li class="dropdown-submenu">
  <a tabindex="0">Another action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li><a tabindex="0">Another sub action</a></li>
    <li><a tabindex="0">Something else here</a></li>
  </ul>
</li>
<li><a tabindex="0">Something else here</a></li>
<li class="divider"></li>
<li><a tabindex="0">Separated link</a></li>
</ul>
      </li>
      <li class="dropdown">
        <a tabindex="0" data-toggle="dropdown" data-submenu>
          Dropdown 2<span class="caret"></span>
        </a>

        <ul class="dropdown-menu">
  <li class="dropdown-submenu">
  <a tabindex="0">Action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another sub action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
    <li><a tabindex="0">Something else here</a></li>
    <li class="disabled"><a tabindex="-1">Disabled action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
  </ul>
</li>
<li class="dropdown-header">Dropdown header</li>
<li class="dropdown-submenu">
  <a tabindex="0">Another action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li><a tabindex="0">Another sub action</a></li>
    <li><a tabindex="0">Something else here</a></li>
  </ul>
</li>
<li><a tabindex="0">Something else here</a></li>
<li class="divider"></li>
<li><a tabindex="0">Separated link</a></li>
</ul>
      </li>
    </ul>

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a tabindex="0" data-toggle="dropdown" data-submenu>
          Dropdown 3<span class="caret"></span>
        </a>

        <ul class="dropdown-menu">
  <li class="dropdown-submenu">
  <a tabindex="0">Action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another sub action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
    <li><a tabindex="0">Something else here</a></li>
    <li class="disabled"><a tabindex="-1">Disabled action</a></li>
    <li class="dropdown-submenu">
      <a tabindex="0">Another action</a>

      <ul class="dropdown-menu">
        <li><a tabindex="0">Sub action</a></li>
        <li><a tabindex="0">Another sub action</a></li>
        <li><a tabindex="0">Something else here</a></li>
      </ul>
    </li>
  </ul>
</li>
<li class="dropdown-header">Dropdown header</li>
<li class="dropdown-submenu">
  <a tabindex="0">Another action</a>

  <ul class="dropdown-menu">
    <li><a tabindex="0">Sub action</a></li>
    <li><a tabindex="0">Another sub action</a></li>
    <li><a tabindex="0">Something else here</a></li>
  </ul>
</li>
<li><a tabindex="0">Something else here</a></li>
<li class="divider"></li>
<li><a tabindex="0">Separated link</a></li>
</ul>
      </li>
    </ul>
  </div>
</nav>

</body>
</html>