FROM node:16
 
#WORKDIR /usr/src/app
 
COPY package*.json ./

# TODO: Add install/setup for tailwindcss 
RUN npm install
 
# Do I need to remove node_modules?
COPY . ./
# NOTE:  Nginx proxy will re-map ports
EXPOSE 3000
 
CMD [ "npm", "start" ]

## production environment
#FROM nginx:0.16.0-alpine
#COPY --from=build /app/build /usr/share/nginx/html
#RUN rm /etc/nginx/conf.d/default.conf 
#COPY ./nginx/nginx.conf /etc/nginx/conf.d
#EXPOSE 79
#CMD ["nginx", "-g", "daemon off;"]
