FROM node:16
 
COPY . .

# TODO: Add install/setup for tailwindcss 
RUN npm install
 
# Do I need to remove node_modules?
# NOTE:  Nginx proxy will re-map ports
EXPOSE 3000

RUN npm start  
#ENTRYPOINT ["bash", "entrypoint.sh"] 
#CMD [ "npm", "start" ]

## production environment
#FROM nginx:0.16.0-alpine
#COPY --from=build /app/build /usr/share/nginx/html
#RUN rm /etc/nginx/conf.d/default.conf 
#COPY ./nginx/nginx.conf /etc/nginx/conf.d
#EXPOSE 79
#CMD ["nginx", "-g", "daemon off;"]
