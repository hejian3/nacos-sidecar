# server.py
# 从wsgiref模块导入:
from wsgiref.simple_server import make_server
# 导入我们自己编写的application函数:
from hello import application

# 创建一个服务器，IP地址为空，端口是9999，处理函数是application:
httpd = make_server('', 9999, application)
print('Serving HTTP on port 9999...')
# 开始监听HTTP请求:
httpd.serve_forever()