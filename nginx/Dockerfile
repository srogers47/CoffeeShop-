FROM nginx 
WORKDIR /nginx/ 
RUN rm /etc/nginx/nginx.conf /etc/nginx/conf.d/default.conf 
COPY ./nginx.conf ./etc/nginx/nginx.conf
# [Was in path above - fix server dir not allowed.] conf.d/defualt.conf 
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

